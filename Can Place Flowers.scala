object Solution {
    def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
        flowerbed.indices.foldLeft(0)((acc, ind) =>
            if (flowerbed(ind) == 0 && (ind == 0 || flowerbed(ind - 1) == 0) && (ind == flowerbed.length - 1 || flowerbed(ind + 1) == 0)) {
                flowerbed(ind) = 1
                if (acc + 1 >= n) return true
                acc + 1
            } else {
                if (acc >= n) return true
                acc
            }
        )
        false
    }
}