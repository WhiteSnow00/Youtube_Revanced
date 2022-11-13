import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoix extends ahbh implements ahcw
{
    public static final aoix a;
    private static volatile ahdd h;
    public int b;
    public ahbx c;
    public String d;
    public akdi e;
    public ahil f;
    public akbq g;
    private ahhu i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aoix.class, (ahbh)(a = new aoix()));
    }
    
    private aoix() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.d = "";
        final ahab b = ahab.b;
    }
    
    public final void a() {
        final ahbx c = this.c;
        if (!c.c()) {
            this.c = ahbh.mutableCopy(c);
        }
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
                if ((h = aoix.h) == null) {
                    synchronized (aoix.class) {
                        if (aoix.h == null) {
                            aoix.h = (ahdd)new ahba((ahbh)aoix.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoix.a;
            }
            case 4: {
                return new ahaz((char[])null, (float[][])null);
            }
            case 3: {
                return new aoix();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoix.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0004\u0001\u041b\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1009\u0003\b\u1409\t\t\u1409\u0006", new Object[] { "b", "c", aoiw.class, "d", "e", "f", "i", "g" });
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
