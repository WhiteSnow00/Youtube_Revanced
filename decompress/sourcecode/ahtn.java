import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtn extends agzi implements ahax
{
    public static final ahtn a;
    public static final agzg b;
    private static volatile ahbe e;
    public aiap c;
    public String d;
    private int f;
    
    static {
        final ahtn a2 = new ahtn();
        agzi.registerDefaultInstance(ahtn.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 303917309, ahcm.k, ahtn.class);
    }
    
    private ahtn() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahtn.e) == null) {
                    synchronized (ahtn.class) {
                        if (ahtn.e == null) {
                            ahtn.e = (ahbe)new agzb((agzi)ahtn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahtn.a;
            }
            case 4: {
                return new agza((agzi)ahtn.a);
            }
            case 3: {
                return new ahtn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "f", "c", "d" });
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
