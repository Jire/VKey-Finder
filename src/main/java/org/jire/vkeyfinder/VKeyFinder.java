package org.jire.vkeyfinder;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import java.util.logging.LogManager;

public final class VKeyFinder {
	
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());
			
			System.exit(1);
			return;
		}
		
		GlobalScreen.addNativeKeyListener(new KeyListener());
		GlobalScreen.addNativeMouseListener(new MouseListener());
		
		System.out.println("Press any key or mouse button and you will see the vkey code");
	}
	
}
