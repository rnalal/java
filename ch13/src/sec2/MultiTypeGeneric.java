package sec2;
import java.util.Map;	//Map은 키(Key)와 값(Value)을 쌍으로 저장하고 있는 컬렉션프레임워크 자료구조이다.
//(key:value); => 예) (name:"재영") name은 key이고, "재영"은 value임
public class MultiTypeGeneric<K, V> implements Map.Entry<K,V>{
	private K key;
	private V value;
	
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
	@Override
	public V setValue(V arg0) {
		this.value = value;
		return value;
	}
	
}
