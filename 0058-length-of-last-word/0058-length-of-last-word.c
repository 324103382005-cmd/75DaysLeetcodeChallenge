int lengthOfLastWord(char* s) {
    int l=0,i=0;
    while(s[i]!='\0'){
        i++;
    }
    i--;
    while(i>=0&& s[i]==' '){
        i--;
    }
    while(i>=0 && s[i]!=' '){
       l++;
       i--;
    }
    return l;
}