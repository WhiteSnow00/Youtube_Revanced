// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand extends agzi implements ahax
{
    public static final PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand a;
    private static volatile ahbe d;
    public static final agzg pivotBarNavigationCommand;
    public String b;
    public boolean c;
    private int e;
    
    static {
        final PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand a2 = new PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand();
        agzi.registerDefaultInstance((Class)PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.class, (agzi)(a = a2));
        pivotBarNavigationCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 404019588, ahcm.k, (Class)PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.class);
    }
    
    private PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.d) == null) {
                    synchronized (PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.class) {
                        if (PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.d == null) {
                            PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.d = (ahbe)new agzb((agzi)PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.a;
            }
            case 4: {
                return new agza((agzi)PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.a);
            }
            case 3: {
                return new PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
