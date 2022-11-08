// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand extends agzi implements ahax
{
    public static final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand a;
    private static volatile ahbe e;
    public static final agzg showPendingReelUploadsCommand;
    public int b;
    public anss c;
    public aioe d;
    private byte f;
    
    static {
        final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand a2 = new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
        agzi.registerDefaultInstance((Class)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class, (agzi)(a = a2));
        showPendingReelUploadsCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 291405045, ahcm.k, (Class)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class);
    }
    
    private ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand() {
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
                if ((e = ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.e) == null) {
                    synchronized (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class) {
                        if (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.e == null) {
                            ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.e = (ahbe)new agzb((agzi)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a);
            }
            case 3: {
                return new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
