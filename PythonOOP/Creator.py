from abc import ABC, abstractmethod


class Creator(ABC):

    @abstractmethod
    def create_man(self):
        pass

    @abstractmethod
    def create_woman(self):
        pass
