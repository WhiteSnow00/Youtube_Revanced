import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appt extends ahcz implements aheo
{
    public static final appt a;
    private static volatile ahev d;
    public int b;
    public amkb c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(appt.class, a = new appt());
    }
    
    private appt() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = appt.d) == null) {
                    synchronized (appt.class) {
                        if (appt.d == null) {
                            appt.d = (ahev)new ahcs((ahcz)appt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appt.a;
            }
            case 4: {
                return new ahcr((ahcz)appt.a);
            }
            case 3: {
                return new appt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appt.a, "\u0001\u0001\u0000\u0001\ue5b3\u21fc\ue5b3\u21fc\u0001\u0000\u0000\u0001\ue5b3\u21fc\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
