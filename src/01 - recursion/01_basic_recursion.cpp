#include <iostream>
using namespace std;


/*---------------------------------------*/
template <typename T = uint64_t>
auto factorial(T value) -> T
{
    if (value == 0)
        return 1;
    else
        return value * factorial(value-1);
}


/*---------------------------------------*/
template <typename T = uint64_t>
auto sum(T value) -> T
{
    if (value == 0)
        return value;
    else
        return value + sum(value-1);
}


/*---------------------------------------*/
int main()
{
    printf("* enter an integer: ");
    int n;
    cin >> n;

    printf( "\n*----------------*");
    cout << "\n* factorial: " << factorial(n);
    cout << "\n* sum:       " << sum(n);
    printf( "\n*----------------*\n");

    printf("\n\n");
    return 0;
}
