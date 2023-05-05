from FamilyPack.MemberFamily import MemberFamily


class Male(MemberFamily):

    def __init__(self, first_name, second_name, name_father, name_mother, age, name_wife):
        super().__init__(first_name, second_name, name_father, name_mother, age)
        self._name_wife = name_wife

    @property
    def name_wife(self):
        return self._name_wife

    @name_wife.setter
    def name_wife(self, value):
        self._name_wife = value

    def __str__(self):
        return super().__str__() + '\n' + str(self.name_wife)
            