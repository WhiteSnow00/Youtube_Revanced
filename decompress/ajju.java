import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajju extends ahcz implements aheo
{
    public static final ajju a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public String d;
    private byte f;
    
    static {
        final ajju a2 = new ajju();
        ahcz.registerDefaultInstance(ajju.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 380917126, ahgc.k, ajju.class);
    }
    
    private ajju() {
        this.f = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ajju.e) == null) {
                    synchronized (ajju.class) {
                        if (ajju.e == null) {
                            ajju.e = (ahev)new ahcs((ahcz)ajju.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajju.a;
            }
            case 4: {
                return new ahcr((ahcz)ajju.a);
            }
            case 3: {
                return new ajju();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajju.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
