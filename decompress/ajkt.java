import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkt extends ahcz implements aheo
{
    public static final ajkt a;
    public static final ahcx b;
    private static volatile ahev k;
    public int c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public String j;
    private byte l;
    
    static {
        final ajkt a2 = new ajkt();
        ahcz.registerDefaultInstance(ajkt.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 372486289, ahgc.k, ajkt.class);
    }
    
    private ajkt() {
        this.l = 2;
        this.d = "";
        this.f = "";
        this.g = "";
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = ajkt.k) == null) {
                    synchronized (ajkt.class) {
                        if (ajkt.k == null) {
                            ajkt.k = (ahev)new ahcs((ahcz)ajkt.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajkt.a;
            }
            case 4: {
                return new ahcr((ahcz)ajkt.a);
            }
            case 3: {
                return new ajkt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajkt.a, "\u0001\u0007\u0000\u0001\u0003\r\u0007\u0000\u0000\u0000\u0003\u1008\u0002\u0006\u1007\u0005\u0007\u1008\u0006\b\u1008\u0007\n\u1007\t\u000b\u1008\u000b\r\u1007\n", new Object[] { "c", "d", "e", "f", "g", "h", "j", "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
