import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almo extends ahcz implements aheo
{
    public static final almo a;
    public static final ahcx b;
    private static volatile ahev f;
    public ahdp c;
    public ahbt d;
    public String e;
    private int g;
    
    static {
        final almo a2 = new almo();
        ahcz.registerDefaultInstance(almo.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajoy.a, a2, (MessageLite)a2, null, 273577170, ahgc.k, almo.class);
    }
    
    private almo() {
        this.c = ahcz.emptyProtobufList();
        this.d = ahbt.b;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = almo.f) == null) {
                    synchronized (almo.class) {
                        if (almo.f == null) {
                            almo.f = (ahev)new ahcs((ahcz)almo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return almo.a;
            }
            case 4: {
                return new ahcr((ahcz)almo.a);
            }
            case 3: {
                return new almo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almo.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u100a\u0000\u0003\u1008\u0001", new Object[] { "g", "c", almn.class, "d", "e" });
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
