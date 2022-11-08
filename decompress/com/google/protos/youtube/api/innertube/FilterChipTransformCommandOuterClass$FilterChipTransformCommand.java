// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class FilterChipTransformCommandOuterClass$FilterChipTransformCommand extends agzi implements ahax
{
    public static final FilterChipTransformCommandOuterClass$FilterChipTransformCommand a;
    private static volatile ahbe e;
    public static final agzg filterChipTransformCommand;
    public int b;
    public String c;
    public aioe d;
    private byte f;
    
    static {
        final FilterChipTransformCommandOuterClass$FilterChipTransformCommand a2 = new FilterChipTransformCommandOuterClass$FilterChipTransformCommand();
        agzi.registerDefaultInstance((Class)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.class, (agzi)(a = a2));
        filterChipTransformCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 355248151, ahcm.k, (Class)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.class);
    }
    
    private FilterChipTransformCommandOuterClass$FilterChipTransformCommand() {
        this.f = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = FilterChipTransformCommandOuterClass$FilterChipTransformCommand.e) == null) {
                    synchronized (FilterChipTransformCommandOuterClass$FilterChipTransformCommand.class) {
                        if (FilterChipTransformCommandOuterClass$FilterChipTransformCommand.e == null) {
                            FilterChipTransformCommandOuterClass$FilterChipTransformCommand.e = (ahbe)new agzb((agzi)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return FilterChipTransformCommandOuterClass$FilterChipTransformCommand.a;
            }
            case 4: {
                return new agza((agzi)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.a);
            }
            case 3: {
                return new FilterChipTransformCommandOuterClass$FilterChipTransformCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)FilterChipTransformCommandOuterClass$FilterChipTransformCommand.a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0001\u0004\u1409\u0004\u0005\u1008\u0002", new Object[] { "b", "d", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
