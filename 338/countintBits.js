/**
 *  * @param {number} num
 *   * @return {number[]}
 *    */
var countBits = function(num) {
  var arr=[0];
  for(var i = 1; i <= num; i++) {
    arr[i] = arr[i&(i-1)] + 1;
  }
  return arr;
};
for(int j = 0; j < 10; j++) {
    alert(countBits(5));
}
