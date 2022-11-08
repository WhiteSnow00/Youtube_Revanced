// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSheetCommandOuterClass$ShowSheetCommand extends agzi implements ahax
{
    public static final ShowSheetCommandOuterClass$ShowSheetCommand a;
    private static volatile ahbe e;
    public static final agzg showSheetCommand;
    public int b;
    public amwi c;
    public anuk d;
    private byte f;
    
    static {
        final ShowSheetCommandOuterClass$ShowSheetCommand a2 = new ShowSheetCommandOuterClass$ShowSheetCommand();
        agzi.registerDefaultInstance((Class)ShowSheetCommandOuterClass$ShowSheetCommand.class, (agzi)(a = a2));
        showSheetCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 443434441, ahcm.k, (Class)ShowSheetCommandOuterClass$ShowSheetCommand.class);
    }
    
    private ShowSheetCommandOuterClass$ShowSheetCommand() {
        this.f = 2;
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
                if ((e = ShowSheetCommandOuterClass$ShowSheetCommand.e) == null) {
                    synchronized (ShowSheetCommandOuterClass$ShowSheetCommand.class) {
                        if (ShowSheetCommandOuterClass$ShowSheetCommand.e == null) {
                            ShowSheetCommandOuterClass$ShowSheetCommand.e = (ahbe)new agzb((agzi)ShowSheetCommandOuterClass$ShowSheetCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ShowSheetCommandOuterClass$ShowSheetCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowSheetCommandOuterClass$ShowSheetCommand.a);
            }
            case 3: {
                return new ShowSheetCommandOuterClass$ShowSheetCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSheetCommandOuterClass$ShowSheetCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
