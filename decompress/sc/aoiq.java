import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiq extends ahbh implements ahcw
{
    public static final aoiq a;
    private static volatile ahdd o;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public aiao f;
    public aiao g;
    public ahbx h;
    public ahab i;
    public aiqj j;
    public int k;
    public int l;
    public aoip m;
    public boolean n;
    private ahhu p;
    private anuv q;
    private ajut r;
    private byte s;
    
    static {
        ahbh.registerDefaultInstance((Class)aoiq.class, (ahbh)(a = new aoiq()));
    }
    
    private aoiq() {
        this.s = 2;
        this.h = emptyProtobufList();
        this.i = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = aoiq.o) == null) {
                    synchronized (aoiq.class) {
                        if (aoiq.o == null) {
                            aoiq.o = (ahdd)new ahba((ahbh)aoiq.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aoiq.a;
            }
            case 4: {
                return new ahaz((ahbh)aoiq.a);
            }
            case 3: {
                return new aoiq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoiq.a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005\b\u100a\u0006\t\u1409\u0007\n\u1409\b\u000b\u100c\t\f\u100c\n\r\u1009\u000b\u000e\u1007\f\u000f\u1409\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", aiae.class, "p", "i", "q", "j", "k", aoet.p, "l", akdh.a(), "m", "n", "r" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
