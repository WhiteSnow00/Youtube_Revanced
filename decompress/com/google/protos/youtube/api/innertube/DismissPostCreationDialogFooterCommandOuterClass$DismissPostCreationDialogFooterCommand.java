// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand extends agzi implements ahax
{
    public static final DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand a;
    private static volatile ahbe b;
    public static final agzg dismissPostCreationDialogFooterCommand;
    
    static {
        final DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand a2 = new DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand();
        agzi.registerDefaultInstance((Class)DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.class, (agzi)(a = a2));
        dismissPostCreationDialogFooterCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 368549163, ahcm.k, (Class)DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.class);
    }
    
    private DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.b) == null) {
                    synchronized (DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.class) {
                        if (DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.b == null) {
                            DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.b = (ahbe)new agzb((agzi)DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.a;
            }
            case 4: {
                return new agza((agzi)DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.a);
            }
            case 3: {
                return new DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.a, "\u0001\u0000", (Object[])null);
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
