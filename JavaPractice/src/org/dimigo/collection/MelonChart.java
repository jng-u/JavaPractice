/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * ㄴ MelonChart
 * 
 * Subject : 
 * 2015. 9. 25.
 * </pre>
 *
 * @author LeeeeeJW
 * @version 1.0
 */
public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		
		list.add(new Music("바람이나 좀 쐐","개리"));
		list.add(new Music("보통연애","박경"));
		list.add(new Music("취향저걱","iKON"));
		System.out.println("<<Melon Chart>>");
		printList(list);
		
		list.add(1, new Music("레옹", "이유갓지"));		
		System.out.println("<<2위곡 추가>>");
		printList(list);
		
		list.set(2, new Music("맙소사","황태지"));
		System.out.println("<<3위곡 변경>>");
		printList(list);
		
		list.remove(3);
		System.out.println("<<4위곡 제거>>");
		printList(list);
		
		list.clear();
		System.out.println("<<전체 리스트 삭제>>");
		printList(list);
		
	}
	
	public static void printList(List<Music> list) {
		for(Music value : list){
			System.out.println(value.toString());
		}
		System.out.println();
	}

}
