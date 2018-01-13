package org.jire.vkeyfinder;

import org.jnativehook.mouse.NativeMouseAdapter;
import org.jnativehook.mouse.NativeMouseEvent;

final class MouseListener extends NativeMouseAdapter {
	
	@Override
	public void nativeMousePressed(NativeMouseEvent nativeMouseEvent) {
		System.out.println("mouse: " + nativeMouseEvent.getButton());
	}
	
}
