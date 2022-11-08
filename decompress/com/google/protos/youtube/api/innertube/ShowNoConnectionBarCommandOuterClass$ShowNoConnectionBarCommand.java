// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand extends agzi implements ahax
{
    public static final ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand a;
    private static volatile ahbe b;
    public static final agzg showNoConnectionBarCommand;
    
    static {
        final ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand a2 = new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
        agzi.registerDefaultInstance((Class)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class, (agzi)(a = a2));
        showNoConnectionBarCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 246536901, ahcm.k, (Class)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class);
    }
    
    private ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.b) == null) {
                    synchronized (ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class) {
                        if (ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.b == null) {
                            ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.b = (ahbe)new agzb((agzi)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a);
            }
            case 3: {
                return new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a, "\u0001\u0000", (Object[])null);
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
