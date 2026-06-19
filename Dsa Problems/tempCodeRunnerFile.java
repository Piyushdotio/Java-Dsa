  public static void unionopt(int arr[],int arr2[]){
        int n=arr.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i < n&&j < m){
            if(arr[i]<=arr2[j]){
                if(list.isEmpty()||list.get(list.size()-1)!=arr[i]){
                list.add(arr[i]);
            }
            i++;
            }
            
            else{
            if(list.isEmpty()||list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        }
        while(i<n){
            if(list.isEmpty()||list.get(list.size()-1)!=arr[i]){
                list.add(arr[i]);
            }
            i++;
        }
        while(j<m){
            if(list.isEmpty()||list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.print(list);
    }