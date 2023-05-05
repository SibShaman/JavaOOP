class MemberFamily:

    def __init__(self, first_name, second_name, name_father, name_mother, age):
        self._first_name = first_name
        self._second_name = second_name
        self._name_father = name_father
        self._name_mother = name_mother
        self._age = age

    @property
    def first_name(self):
        return self._first_name

    @first_name.setter
    def first_name(self, value):
        self._first_name = value

    @property
    def second_name(self):
        return self._second_name

    @second_name.setter
    def second_name(self, value):
        self._second_name = value

    @property
    def name_father(self):
        return self._name_father

    @name_father.setter
    def name_father(self, value):
        self._name_father = value

    @property
    def name_mother(self):
        return self._name_mother

    @name_mother.setter
    def name_mother(self, value):
        self._name_mother = value

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, value):
        self._age = value

    def __str__(self):
        return str(self.first_name) + '\n' + \
            str(self.second_name) + '\n' + \
            str(self.name_father) + '\n' + \
            str(self.name_mother) + '\n' + \
            str(self.age)
