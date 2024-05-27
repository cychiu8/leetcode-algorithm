# 2352. EqualRowAndColumnPairs

* cannot use hashcode -> will face hashcode collision problem when the grid is [[2,1],[3,32]]
    ```
    Arrays.hashCode([2,1]) => 1024
    Arrays.hashCode([1,32]) => 1024

    --------------------------------
    Arrays.hashCode() =>
    result = 31 * result + element[i]
    ```