// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand extends agzi implements ahax
{
    public static final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand a;
    public static final agzg filterBarContentInsertionCommand;
    private static volatile ahbe g;
    public int b;
    public anss c;
    public int d;
    public aioe e;
    public boolean f;
    private byte h;
    
    static {
        final FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand a2 = new FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand();
        agzi.registerDefaultInstance((Class)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class, (agzi)(a = a2));
        filterBarContentInsertionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 362185493, ahcm.k, (Class)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class);
    }
    
    private FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand() {
        this.h = 2;
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
                final ahbe g;
                if ((g = FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.g) == null) {
                    synchronized (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.class) {
                        if (FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.g == null) {
                            FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.g = (ahbe)new agzb((agzi)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.a;
            }
            case 4: {
                return new agza((agzi)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.a);
            }
            case 3: {
                return new FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u100b\u0001\u0006\u1409\u0005\u0007\u1007\u0006", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
