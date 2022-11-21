import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apit extends ahcz implements aheo
{
    public static final apit a;
    public static final ahcx b;
    private static volatile ahev d;
    public aisc c;
    private int e;
    private byte f;
    
    static {
        final apit a2 = new apit();
        ahcz.registerDefaultInstance(apit.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 383499401, ahgc.k, apit.class);
    }
    
    private apit() {
        this.f = 2;
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
                final ahev d;
                if ((d = apit.d) == null) {
                    synchronized (apit.class) {
                        if (apit.d == null) {
                            apit.d = (ahev)new ahcs((ahcz)apit.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apit.a;
            }
            case 4: {
                return new ahcr((ahcz)apit.a);
            }
            case 3: {
                return new apit();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apit.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
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
