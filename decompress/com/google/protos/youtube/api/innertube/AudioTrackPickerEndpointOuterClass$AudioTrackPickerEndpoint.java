// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint extends ahbc implements ahbd
{
    public static final AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint a;
    public static final ahbf audioTrackPickerEndpoint;
    private static volatile ahdd b;
    private byte c;
    
    static {
        final AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint a2 = new AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint();
        ahbh.registerDefaultInstance((Class)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.class, (ahbh)(a = a2));
        audioTrackPickerEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 100498558, ahek.k, (Class)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.class);
    }
    
    private AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.b) == null) {
                    synchronized (AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.class) {
                        if (AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.b == null) {
                            AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.b = (ahdd)new ahba((ahbh)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a;
            }
            case 4: {
                return new ahbb((ahbc)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a);
            }
            case 3: {
                return new AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                byte c;
                if (o == null) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                this.c = c;
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
