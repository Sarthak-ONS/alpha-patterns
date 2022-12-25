#include <bits/stdc++.h>
using namespace std;

void A(int n)
{
    for (int i = 0; i < n; i++)
    {
        if (i == (n / 2))
        {
            for (int j = 0; j < n - i; j++)
            {
                cout << " ";
            }
            for (int j = n - i; j <= n; j++)
            {
                cout << "* ";
            }
        }
        else
        {
            for (int j = 0; j < n - i; j++)
            {
                cout << " ";
            }
            cout << "*";
            for (int j = (2 * n) - 2 * i + 1; j < n; j++)
            {
                cout << " ";
            }
            cout << "*";
        }
        cout << endl;
    }
}

int main()
{
    int n;
    cin >> n;
    A(n);
    return 0;
}