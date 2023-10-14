class Bank:
    def __init__(self):
        self.bal = 50000
        self.pwd = 0
        self.acc = 220305510

    def deposit(self, var1):
        print("Enter Password: ")
        self.pwd = int(input())
        if self.pwd == 3700:
            self.bal += var1
            print(f"Now you can deposit: {var1}Rs")
            print(f"Total balance: {self.bal}Rs")
        else:
            print("Incorrect password")

    def withdraw(self, var1):
        print("Enter Password: ")
        self.pwd = int(input())
        if self.pwd == 3700:
            self.bal -= var1
            print(f"Now you Withdraw: {var1}Rs")
            print(f"Total balance: {self.bal}Rs")
        else:
            print("Incorrect password")

    def check_balance(self):
        print("Enter Password: ")
        self.pwd = int(input())
        if self.pwd == 3700:
            print(f"Total balance: {self.bal}Rs")
        else:
            print("Incorrect password")

    def transfer(self, var1):
        print("Enter Password: ")
        self.pwd = int(input())
        print("Enter account : ")
        self.acc = int(input())

        if self.pwd == 3700:
            if self.acc == 220305510:
                print(f"Before Amount transfer balance: {self.bal}Rs")
                print(f"Now you Transfer: {var1}Rs")
                self.bal -= var1
                print(f"After Amount transfer balance: {self.bal}Rs")
            else:
                print("Invalid account Number you entered")
        else:
            print("Incorrect password")

def main():
    BK = Bank()

    ch = 0
    print("1.Deposit :")
    print("2.Withdraw :")
    print("3.Check Balance :")
    print("4.Transfer Money :")
    print("Enter Your Choice :")

    # Taking input from the user: deposit, withdraw, check_balance, transfer
    ch = int(input())

    if ch == 1:
        print("Enter How much Amount deposit you : ")
        var1 = int(input())
        BK.deposit(var1)
    elif ch == 2:
        print("Enter How much Amount withdraw you : ")
        var1 = int(input())
        BK.withdraw(var1)
    elif ch == 3:
        BK.check_balance()
    elif ch == 4:
        print("Enter How much Amount you want to Transfer : ")
        var1 = int(input())
        BK.transfer(var1)
    else:
        print("You chose a service not available right now. Try again!")

if __name__ == "__main__":
    main()
