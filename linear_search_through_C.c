#include<stdio.h>
int main(){
	int i,a[50],size,key;
	printf("Enter the size of array");
	scanf("%d",&size);
	printf("Enter elements:");
	for(i=0;i<size;i++){
		scanf("%d", &a[i]);
	}
	
	printf("Enter the number you want to search: ");	
	scanf("%d",&key);
	int k =0;
	for(i=0;i<size;i++){
		if(a[i]== key){
			k=1;
			printf("Found at %d\n",i);
			break;
		}
	}
	if(k==0){
		printf("Not found");
	}	
	
}
