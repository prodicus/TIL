#include <iostream>
#include <stack>
#include <string>
using namespace std;

class Parantheses{
	stack <char> S;
public:
	bool pass_parantheses(string);
	bool match_parantheses(char , char);
};

bool Parantheses::match_parantheses(char inner,char outer){
	if(inner == '[' && outer == ']') return true;
	else if(inner == '(' && outer == ')') return true;
	else if(inner == '{' && outer == '}') return true;
	else return false;
}

bool Parantheses::pass_parantheses(string arr){
	// we will now traverse the whole character array only for the brackets and leave the rest of the stuff

	for (int i = 0; i < arr.length() ;  ++i){

		if ( arr[i] == '[' || arr[i] == '{' || arr[i] == '(' )
			S.push(arr[i]); 			// pushing to the stack

		// else when we are traversing the array, we will check for the other half of the bracket and if we find it
		// first we will check whether the stack is empty or not. If empty return a false( i.e expression is not balanced)
		// if the stack is not empty, we will check whether the element at the top of the stack matches the closing bracket
		// 		we just encountered

		if( arr[i] == ']' || arr[i] == '}' || arr[i] == ')' ){
			if( S.empty() || !match_parantheses(S.top() , arr[i])){
				// that is either the list is empty or the top of stack does not match the element just read
				return false;
			}
			else 		// that is a match is found and we need to pop that opening bracket 
				S.pop();
		}
	}

	// finally when the scan is over, we can perform whether the scan is over or not and depending on that we will return a
	//  true or false

	return S.empty()?true:false;
}

int main(int argc, char const *argv[]){
	cout << "\n";

	Parantheses obj;
	string ch = "{}(){{" ;

	if(obj.pass_parantheses(ch)){
		cout << ch << " is Balanced ";
	}
	else
		cout << ch << " is  NOT Balanced ";

	cout << "\n";
}