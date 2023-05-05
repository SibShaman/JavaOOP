from FamilyPack import MemberFamily


class Female(MemberFamily):
    def __init__(self, first_name, second_name, name_father, name_mother, age, name_husband):
        super().__init__(first_name, second_name, name_father, name_mother, age)
        self._name_husband = name_husband

    @property
    def name_husband(self):
        return self._name_husband

    @name_husband.setter
    def name_husband(self, value):
        self._name_husband = value

    def __str__(self):
        return super().__str__() + '\n' + str(self.name_husband)



