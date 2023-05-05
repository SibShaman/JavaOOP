from Creator import Creator
from FamilyPack import Male, Female


class Family(Creator):

    def create_man(self):
        first_name = input('Введите имя: ')
        second_name = input('Введите фамилию: ')
        name_father = input('Введите имя отца: ')
        name_mother = input('Введите имя матери: ')
        age = input('Введите возраст: ')
        name_wife = input('Введите имя жены:')
        man = Male(first_name, second_name, name_father, name_mother, age, name_wife)
        return man

    def create_woman(self):
        first_name = input('Введите имя: ')
        second_name = input('Введите фамилию: ')
        name_father = input('Введите имя отца: ')
        name_mother = input('Введите имя матери: ')
        age = input('Введите возраст: ')
        name_husband = input('Введите имя мужа:')
        woman = Female(first_name, second_name, name_father, name_mother, age, name_husband)
        return woman


