#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Author: tasdik
# @Date:   2016-01-26
# @Email:  prodicus@outlook.com  Github username: @prodicus
# @Last Modified by:   tasdik
# @Last Modified time: 2016-01-29
# MIT License. You can find a copy of the License @
# http://prodicus.mit-license.org

from peewee import *  # I know,I know. But this is more of a peewee convention

db = SqliteDatabase('students.db')


class Student(Model):

    """Notice that we use singular names for the class name 
    as a model represents a single table in the database
    """
    # username would be column in the database
    username = CharField(max_length=255, unique=True)
    points = IntegerField(default=0)

    # the last thing that you should do is tell the Model in which DB it
    # belongs to
    class Meta:
        database = db

    """This Model, 'Student' will have 5 very useful methods in it 
    
    .create : adds a new row to the table
    .select : select rows out of the table
    .get : get a single row from a table
    .save : will update an existing row in the database
    .delete_instance : delete a row from the table

    Refer the peewee docs for reading about the other methods in Models
    """

students = [
    {'username': 'tasdik',
     'points': 200
     },
    {'username': 'kellogs',
     'points': 400
     },
    {'username': 'john',
     'points': 500
     },
    {'username': 'doe',
     'points': 600
     },
    {'username': 'madboy1995',
     'points': 1000
     },
]


def add_students():
    for student in students:
        try:
            Student.create(
                username=student['username'],
                points=student['points']
            )
        except IntegrityError:
            # raises an exception if a student of the same username is already
            # there in the database
            student_record = Student.get(username=student['username'])
            # check for changes in the points
            if student['points'] != student_record.points:
                student_record.points = Student.get(points=student['points'])
            student_record.save()
            # saves the new values of points for the particular student
def top_student():
    """Returns back the student with the highest number of points 
    in the database
    """
    student = Student.select().order_by(Student.points.desc()).get()
    return student


if __name__ == "__main__":
    db.connect()
    db.create_tables([Student], safe=True)
    # the 'safe' flag is used to tell peewee to not freak out if the table
    # 'Student' is already there

    # adding values to the tables
    add_students()
    print("Our top student is  : {student.username} with marks {student.points}".format(
        student=top_student()
        )
    )
