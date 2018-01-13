package org.jire.vkeyfinder;

import org.jnativehook.keyboard.NativeKeyAdapter;
import org.jnativehook.keyboard.NativeKeyEvent;

final class KeyListener extends NativeKeyAdapter {
	
	@Override
	public void nativeKeyPressed(NativeKeyEvent nativeKeyEvent) {
		System.out.println("key: " + nativeKeyEvent.getKeyCode());
	}
	
}
