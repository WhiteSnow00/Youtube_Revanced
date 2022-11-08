// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand extends agzi implements ahax
{
    public static final EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand a;
    public static final agzg editSubscriptionsCollectionCommand;
    private static volatile ahbe g;
    public int b;
    public aklg c;
    public aioe d;
    public aioe e;
    public aioe f;
    private byte h;
    
    static {
        final EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand a2 = new EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand();
        agzi.registerDefaultInstance((Class)EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.class, (agzi)(a = a2));
        editSubscriptionsCollectionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 378557652, ahcm.k, (Class)EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.class);
    }
    
    private EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand() {
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
                if ((g = EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.g) == null) {
                    synchronized (EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.class) {
                        if (EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.g == null) {
                            EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.g = (ahbe)new agzb((agzi)EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.a;
            }
            case 4: {
                return new agza((agzi)EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.a);
            }
            case 3: {
                return new EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1009\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0002", new Object[] { "b", "c", "d", "f", "e" });
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
