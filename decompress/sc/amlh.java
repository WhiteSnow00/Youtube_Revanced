import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amlh extends ahbh implements ahcw
{
    public static final amlh a;
    private static volatile ahdd h;
    public int b;
    public amlm c;
    public amlf d;
    public ahbx e;
    public amle f;
    public ahab g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)amlh.class, (ahbh)(a = new amlh()));
    }
    
    private amlh() {
        this.j = 2;
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
                if ((h = amlh.h) == null) {
                    synchronized (amlh.class) {
                        if (amlh.h == null) {
                            amlh.h = (ahdd)new ahba((ahbh)amlh.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amlh.a;
            }
            case 4: {
                return new ahaz((ahbh)amlh.a);
            }
            case 3: {
                return new amlh();
            }
            case 2: {
                return newMessageInfo((MessageLite)amlh.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001\u1409\u0001\u0002\u041b\u0003\u1409\u0005\u0004\u100a\u0006\u0005\u1409\u0002\u0006\u1409\u0000", new Object[] { "b", "d", "e", amlk.class, "i", "g", "f", "c" });
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
