/**
 */
package miniMechaCode.provider;

import java.util.ArrayList;
import java.util.Collection;

import miniMechaCode.util.MiniMechaCodeAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniMechaCodeItemProviderAdapterFactory extends MiniMechaCodeAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniMechaCodeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.MiniMechaCode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniMechaCodeItemProvider miniMechaCodeItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.MiniMechaCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMiniMechaCodeAdapter() {
		if (miniMechaCodeItemProvider == null) {
			miniMechaCodeItemProvider = new MiniMechaCodeItemProvider(this);
		}

		return miniMechaCodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Number} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberItemProvider numberItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Number}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberAdapter() {
		if (numberItemProvider == null) {
			numberItemProvider = new NumberItemProvider(this);
		}

		return numberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Boolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanItemProvider booleanItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanAdapter() {
		if (booleanItemProvider == null) {
			booleanItemProvider = new BooleanItemProvider(this);
		}

		return booleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.DefVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefVariableItemProvider defVariableItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.DefVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefVariableAdapter() {
		if (defVariableItemProvider == null) {
			defVariableItemProvider = new DefVariableItemProvider(this);
		}

		return defVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Minus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusItemProvider minusItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Minus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinusAdapter() {
		if (minusItemProvider == null) {
			minusItemProvider = new MinusItemProvider(this);
		}

		return minusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Multi} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiItemProvider multiItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Multi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiAdapter() {
		if (multiItemProvider == null) {
			multiItemProvider = new MultiItemProvider(this);
		}

		return multiItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Div} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivItemProvider divItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Div}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivAdapter() {
		if (divItemProvider == null) {
			divItemProvider = new DivItemProvider(this);
		}

		return divItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.NumberLitteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberLitteralItemProvider numberLitteralItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.NumberLitteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberLitteralAdapter() {
		if (numberLitteralItemProvider == null) {
			numberLitteralItemProvider = new NumberLitteralItemProvider(this);
		}

		return numberLitteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Plus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusItemProvider plusItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Plus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlusAdapter() {
		if (plusItemProvider == null) {
			plusItemProvider = new PlusItemProvider(this);
		}

		return plusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.RefVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefVariableItemProvider refVariableItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.RefVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefVariableAdapter() {
		if (refVariableItemProvider == null) {
			refVariableItemProvider = new RefVariableItemProvider(this);
		}

		return refVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.BooleanLitteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLitteralItemProvider booleanLitteralItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.BooleanLitteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanLitteralAdapter() {
		if (booleanLitteralItemProvider == null) {
			booleanLitteralItemProvider = new BooleanLitteralItemProvider(this);
		}

		return booleanLitteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.DefFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefFunctionItemProvider defFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.DefFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefFunctionAdapter() {
		if (defFunctionItemProvider == null) {
			defFunctionItemProvider = new DefFunctionItemProvider(this);
		}

		return defFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Loop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopItemProvider loopItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Loop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopAdapter() {
		if (loopItemProvider == null) {
			loopItemProvider = new LoopItemProvider(this);
		}

		return loopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.GreaterOrEqual} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterOrEqualItemProvider greaterOrEqualItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.GreaterOrEqual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterOrEqualAdapter() {
		if (greaterOrEqualItemProvider == null) {
			greaterOrEqualItemProvider = new GreaterOrEqualItemProvider(this);
		}

		return greaterOrEqualItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Greater} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterItemProvider greaterItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Greater}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterAdapter() {
		if (greaterItemProvider == null) {
			greaterItemProvider = new GreaterItemProvider(this);
		}

		return greaterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Less} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessItemProvider lessItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Less}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLessAdapter() {
		if (lessItemProvider == null) {
			lessItemProvider = new LessItemProvider(this);
		}

		return lessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Equal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualItemProvider equalItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Equal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualAdapter() {
		if (equalItemProvider == null) {
			equalItemProvider = new EqualItemProvider(this);
		}

		return equalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Or} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Or}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.BinaryOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperatorItemProvider binaryOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryOperatorAdapter() {
		if (binaryOperatorItemProvider == null) {
			binaryOperatorItemProvider = new BinaryOperatorItemProvider(this);
		}

		return binaryOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Math} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathItemProvider mathItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Math}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMathAdapter() {
		if (mathItemProvider == null) {
			mathItemProvider = new MathItemProvider(this);
		}

		return mathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.BooleanOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOperationItemProvider booleanOperationItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.BooleanOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanOperationAdapter() {
		if (booleanOperationItemProvider == null) {
			booleanOperationItemProvider = new BooleanOperationItemProvider(this);
		}

		return booleanOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.FunctionCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallItemProvider functionCallItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionCallAdapter() {
		if (functionCallItemProvider == null) {
			functionCallItemProvider = new FunctionCallItemProvider(this);
		}

		return functionCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.UnaryOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryOperatorItemProvider unaryOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaryOperatorAdapter() {
		if (unaryOperatorItemProvider == null) {
			unaryOperatorItemProvider = new UnaryOperatorItemProvider(this);
		}

		return unaryOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.UnitOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitOperatorItemProvider unitOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.UnitOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitOperatorAdapter() {
		if (unitOperatorItemProvider == null) {
			unitOperatorItemProvider = new UnitOperatorItemProvider(this);
		}

		return unitOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Mm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MmItemProvider mmItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Mm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMmAdapter() {
		if (mmItemProvider == null) {
			mmItemProvider = new MmItemProvider(this);
		}

		return mmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Cm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmItemProvider cmItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Cm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCmAdapter() {
		if (cmItemProvider == null) {
			cmItemProvider = new CmItemProvider(this);
		}

		return cmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Rotate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateItemProvider rotateItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Rotate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotateAdapter() {
		if (rotateItemProvider == null) {
			rotateItemProvider = new RotateItemProvider(this);
		}

		return rotateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Forward} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardItemProvider forwardItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Forward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForwardAdapter() {
		if (forwardItemProvider == null) {
			forwardItemProvider = new ForwardItemProvider(this);
		}

		return forwardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Void} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidItemProvider voidItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Void}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVoidAdapter() {
		if (voidItemProvider == null) {
			voidItemProvider = new VoidItemProvider(this);
		}

		return voidItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.FunctionParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionParameterItemProvider functionParameterItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.FunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionParameterAdapter() {
		if (functionParameterItemProvider == null) {
			functionParameterItemProvider = new FunctionParameterItemProvider(this);
		}

		return functionParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link miniMechaCode.Convertion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConvertionItemProvider convertionItemProvider;

	/**
	 * This creates an adapter for a {@link miniMechaCode.Convertion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConvertionAdapter() {
		if (convertionItemProvider == null) {
			convertionItemProvider = new ConvertionItemProvider(this);
		}

		return convertionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (miniMechaCodeItemProvider != null)
			miniMechaCodeItemProvider.dispose();
		if (numberItemProvider != null)
			numberItemProvider.dispose();
		if (typeItemProvider != null)
			typeItemProvider.dispose();
		if (booleanItemProvider != null)
			booleanItemProvider.dispose();
		if (defVariableItemProvider != null)
			defVariableItemProvider.dispose();
		if (expressionItemProvider != null)
			expressionItemProvider.dispose();
		if (minusItemProvider != null)
			minusItemProvider.dispose();
		if (multiItemProvider != null)
			multiItemProvider.dispose();
		if (divItemProvider != null)
			divItemProvider.dispose();
		if (numberLitteralItemProvider != null)
			numberLitteralItemProvider.dispose();
		if (plusItemProvider != null)
			plusItemProvider.dispose();
		if (refVariableItemProvider != null)
			refVariableItemProvider.dispose();
		if (booleanLitteralItemProvider != null)
			booleanLitteralItemProvider.dispose();
		if (defFunctionItemProvider != null)
			defFunctionItemProvider.dispose();
		if (loopItemProvider != null)
			loopItemProvider.dispose();
		if (greaterOrEqualItemProvider != null)
			greaterOrEqualItemProvider.dispose();
		if (greaterItemProvider != null)
			greaterItemProvider.dispose();
		if (lessItemProvider != null)
			lessItemProvider.dispose();
		if (equalItemProvider != null)
			equalItemProvider.dispose();
		if (orItemProvider != null)
			orItemProvider.dispose();
		if (andItemProvider != null)
			andItemProvider.dispose();
		if (notItemProvider != null)
			notItemProvider.dispose();
		if (binaryOperatorItemProvider != null)
			binaryOperatorItemProvider.dispose();
		if (mathItemProvider != null)
			mathItemProvider.dispose();
		if (booleanOperationItemProvider != null)
			booleanOperationItemProvider.dispose();
		if (functionCallItemProvider != null)
			functionCallItemProvider.dispose();
		if (unaryOperatorItemProvider != null)
			unaryOperatorItemProvider.dispose();
		if (unitOperatorItemProvider != null)
			unitOperatorItemProvider.dispose();
		if (mmItemProvider != null)
			mmItemProvider.dispose();
		if (cmItemProvider != null)
			cmItemProvider.dispose();
		if (rotateItemProvider != null)
			rotateItemProvider.dispose();
		if (forwardItemProvider != null)
			forwardItemProvider.dispose();
		if (voidItemProvider != null)
			voidItemProvider.dispose();
		if (functionParameterItemProvider != null)
			functionParameterItemProvider.dispose();
		if (convertionItemProvider != null)
			convertionItemProvider.dispose();
	}

}
