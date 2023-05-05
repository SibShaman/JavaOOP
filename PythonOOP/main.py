from FamilyPack.Family import Family


def start():
    family = Family()
    print(family.create_man())
    print(family.create_woman())


if __name__ == '__main__':
    start()
