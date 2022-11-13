import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angr extends ahbh implements ahcw
{
    public static final angr a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public ahbx d;
    public ahbx e;
    public ajut f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        final angr a2 = new angr();
        ahbh.registerDefaultInstance((Class)angr.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)anuu.a, (Object)a2, (MessageLite)a2, (ahbm)null, 57158578, ahek.k, (Class)angr.class);
    }
    
    private angr() {
        this.j = 2;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = angr.h) == null) {
                    synchronized (angr.class) {
                        if (angr.h == null) {
                            angr.h = (ahdd)new ahba((ahbh)angr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return angr.a;
            }
            case 4: {
                return new ahaz((ahbh)angr.a);
            }
            case 3: {
                return new angr();
            }
            case 2: {
                return newMessageInfo((MessageLite)angr.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0004\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u041b", new Object[] { "c", "d", angt.class, "f", "i", "g", "e", angs.class });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
