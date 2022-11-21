import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amby extends ahcz implements aheo
{
    public static final amby a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public String d;
    public String e;
    public ahdp f;
    public String g;
    public aqbx h;
    public ahbt i;
    
    static {
        final amby a2 = new amby();
        ahcz.registerDefaultInstance(amby.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 137, ahgc.k, amby.class);
    }
    
    private amby() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = ahcz.emptyProtobufList();
        this.g = "";
        this.i = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = amby.j) == null) {
                    synchronized (amby.class) {
                        if (amby.j == null) {
                            amby.j = (ahev)new ahcs((ahcz)amby.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amby.a;
            }
            case 4: {
                return new ahcr((ahcz)amby.a);
            }
            case 3: {
                return new amby();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amby.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u001b\u0005\u1008\u0003\u0006\u1009\u0004\u0007\u100a\u0005", new Object[] { "c", "d", "e", "f", ajht.class, "g", "h", "i" });
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
