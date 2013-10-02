/** 
 * Ideas4All Android application
 * 
 * @author Jon Segador <jonseg@gmail.com> || http://jonsegador.com
 * Released under MIT license, https://raw.github.com/jonseg/ideas4all_android/master/LICENSE.txt
 * 
 */

package com.jonsegador.ideas4all;

public class Comment {

    private String comment = null;
    private String date = null;

	public Comment(String comment2, String date2){
		comment = comment2;
		date = date2;
	}    
    
    public String getComment() {
     return comment;
    }
    public void setComment(String extractedString) {
     this.comment = extractedString;
    }
    
    public String getDate() {
     return date;
    }
    public void setDate(String extractedString) {
     this.date = extractedString;
    }    
    
    public String toString(){
         return "comment = " + this.comment;
    }	
	
}
