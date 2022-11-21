import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apui extends ahcz implements aheo
{
    public static final apui a;
    private static volatile ahev f;
    public int b;
    public aowb c;
    public aisc d;
    public ajws e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apui.class, a = new apui());
    }
    
    private apui() {
        this.h = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apui.f) == null) {
                    synchronized (apui.class) {
                        if (apui.f == null) {
                            apui.f = (ahev)new ahcs((ahcz)apui.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apui.a;
            }
            case 4: {
                return new ahcr((ahcz)apui.a);
            }
            case 3: {
                return new apui();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apui.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
