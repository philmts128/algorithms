#include <iostream>
#include <vector>
using namespace std;


/*---------------------------------------*/
template <typename T = int>
auto max_val(const vector<T>& values, int beg, int end) -> T
{
    T mx;

    if (beg == end) {
        return values[beg];
    } else {
        mx = max_val(values, beg+1, end);

        if (mx >= values[beg])
            return mx;
        else
            return values[beg];
    }
}


/*---------------------------------------*/
template <typename T = int>
auto min_val(const vector<T>& values, int beg, int end) -> T
{
    T mn;

    if (beg == end) {
        return values[beg];
    } else {
        mn = min_val(values, beg+1, end);

        if (mn <= values[beg])
            return mn;
        else
            return values[beg];
    }
}


/*---------------------------------------*/
int main()
{
    vector<int> nums;

    printf("| enter a sequence of integers[-1 to stop]: ");
    int n;
    while (cin >> n) {
        if (n == -1) break;
        nums.push_back(n);
    }

    int mx = max_val(nums, 0, nums.size()-1);
    int mn = min_val(nums, 0, nums.size()-1);

    printf("\n*-------------*");
    printf("\n* max: %d", mx);
    printf("\n* min: %d", mn);
    printf("\n*-------------*");

    printf("\n\n");
    return 0;
}
