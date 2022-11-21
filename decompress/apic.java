import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apic extends ahcz implements aheo
{
    public static final apic a;
    private static volatile ahev b;
    private int c;
    private aizd d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apic.class, a = new apic());
    }
    
    private apic() {
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
                final ahev b;
                if ((b = apic.b) == null) {
                    synchronized (apic.class) {
                        if (apic.b == null) {
                            apic.b = (ahev)new ahcs((ahcz)apic.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apic.a;
            }
            case 4: {
                return new ahcr((ahcz)apic.a);
            }
            case 3: {
                return new apic();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apic.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "c", "d" });
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
