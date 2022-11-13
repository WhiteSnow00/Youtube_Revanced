// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand extends ahbh implements ahcw
{
    public static final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand a;
    private static volatile ahdd m;
    public static final ahbf showWebViewDialogCommand;
    public int b;
    public String c;
    public boolean d;
    public ahbx e;
    public aiqj f;
    public ahbx g;
    public ajut h;
    public anuv i;
    public boolean j;
    public int k;
    public ahab l;
    private aiqj n;
    private ahhu o;
    private byte p;
    
    static {
        final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand a2 = new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
        ahbh.registerDefaultInstance((Class)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class, (ahbh)(a = a2));
        showWebViewDialogCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 243963315, ahek.k, (Class)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class);
    }
    
    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand() {
        this.p = 2;
        this.c = "";
        this.e = emptyProtobufList();
        this.g = emptyProtobufList();
        this.l = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.m) == null) {
                    synchronized (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class) {
                        if (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.m == null) {
                            ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.m = (ahdd)new ahba((ahbh)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a);
            }
            case 3: {
                return new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0002\u0007\u0001\u1008\u0000\u0002\u1409\u0004\u0003\u1409\u0005\u0004\u1007\u0001\u0005\u041b\u0006\u1409\t\u0007\u100a\n\b\u1007\u0006\t\u100c\b\u000b\u1409\u0002\f\u1409\u0003\r\u041b", new Object[] { "b", "c", "h", "i", "d", "e", aiqj.class, "o", "l", "j", "k", apuh.a, "n", "f", "g", apuo.class });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
