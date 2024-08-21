package Generics;

public class NonGenericClass {

	<T1, T3> void vmethod(T1 var1, T3 var3) {
		System.out.println(var1);
		System.out.println(var3);
	}

	<T1, T3> T3 rmethod(T1 v1, T3 v3) {
		if (v1 == null) {
			return v3;
		}
		return null;
	}
}
