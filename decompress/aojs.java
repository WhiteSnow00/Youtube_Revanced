import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojs extends ahcz implements aheo
{
    public static final aojs a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public boolean d;
    public ajws e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aojs.class, a = new aojs());
    }
    
    private aojs() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
    }
    
    public final void a() {
        final ahdp c = this.c;
        if (!c.c()) {
            this.c = ahcz.mutableCopy(c);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aojs.f) == null) {
                    synchronized (aojs.class) {
                        if (aojs.f == null) {
                            aojs.f = (ahev)new ahcs((ahcz)aojs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aojs.a;
            }
            case 4: {
                return new ahcr((float[])null, (short[])null);
            }
            case 3: {
                return new aojs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojs.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1007\u0000\u0003\u1409\u0001", new Object[] { "b", "c", aojt.class, "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
