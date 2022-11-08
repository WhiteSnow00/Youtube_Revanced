// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand extends agzi implements ahax
{
    public static final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand a;
    private static volatile ahbe m;
    public static final agzg showWebViewDialogCommand;
    public int b;
    public String c;
    public boolean d;
    public agzy e;
    public aioe f;
    public agzy g;
    public ajsq h;
    public anss i;
    public boolean j;
    public int k;
    public agyc l;
    private aioe n;
    private ahfw o;
    private byte p;
    
    static {
        final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand a2 = new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
        agzi.registerDefaultInstance((Class)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class, (agzi)(a = a2));
        showWebViewDialogCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 243963315, ahcm.k, (Class)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class);
    }
    
    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand() {
        this.p = 2;
        this.c = "";
        this.e = emptyProtobufList();
        this.g = emptyProtobufList();
        this.l = agyc.b;
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
                final ahbe m;
                if ((m = ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.m) == null) {
                    synchronized (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class) {
                        if (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.m == null) {
                            ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.m = (ahbe)new agzb((agzi)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a);
            }
            case 3: {
                return new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0002\u0007\u0001\u1008\u0000\u0002\u1409\u0004\u0003\u1409\u0005\u0004\u1007\u0001\u0005\u041b\u0006\u1409\t\u0007\u100a\n\b\u1007\u0006\t\u100c\b\u000b\u1409\u0002\f\u1409\u0003\r\u041b", new Object[] { "b", "c", "h", "i", "d", "e", aioe.class, "o", "l", "j", "k", apsc.b, "n", "f", "g", apsf.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
