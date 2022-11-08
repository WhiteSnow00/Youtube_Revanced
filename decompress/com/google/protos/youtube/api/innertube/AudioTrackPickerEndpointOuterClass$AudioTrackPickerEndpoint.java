// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint extends agzd implements agze
{
    public static final AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint a;
    public static final agzg audioTrackPickerEndpoint;
    private static volatile ahbe b;
    private byte c;
    
    static {
        final AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint a2 = new AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint();
        agzi.registerDefaultInstance((Class)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.class, (agzi)(a = a2));
        audioTrackPickerEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 100498558, ahcm.k, (Class)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.class);
    }
    
    private AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.b) == null) {
                    synchronized (AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.class) {
                        if (AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.b == null) {
                            AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.b = (ahbe)new agzb((agzi)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a;
            }
            case 4: {
                return new agzc(AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a);
            }
            case 3: {
                return new AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
