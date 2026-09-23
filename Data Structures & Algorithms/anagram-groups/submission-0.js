class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let ans={}
        for(let i =0 ;i<strs.length;i++){
            let key= strs[i].split('').sort().join();
            if(!ans[key]){
                ans[key]=[]
            }
            ans[key].push(strs[i])
        }
        return Object.values(ans)
    }
    
}
