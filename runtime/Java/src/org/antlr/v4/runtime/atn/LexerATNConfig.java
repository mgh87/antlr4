package org.antlr.v4.runtime.atn;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

public class LexerATNConfig extends ATNConfig {
	/** Capture lexer action we traverse */
	public int lexerActionIndex = -1;

	public LexerATNConfig(@NotNull ATNState state,
						  int alt,
						  @Nullable PredictionContext context)
	{
		super(state, alt, context, SemanticContext.NONE);
	}

	public LexerATNConfig(@NotNull ATNState state,
						  int alt,
						  @Nullable PredictionContext context,
						  int actionIndex)
	{
		super(state, alt, context, SemanticContext.NONE);
		this.lexerActionIndex = actionIndex;
	}

	public LexerATNConfig(@NotNull LexerATNConfig c, @NotNull ATNState state) {
		super(c, state, c.context, c.semanticContext);
		this.lexerActionIndex = c.lexerActionIndex;
	}

	public LexerATNConfig(@NotNull LexerATNConfig c, @NotNull ATNState state,
						  @NotNull SemanticContext semanticContext) {
		super(c, state, c.context, semanticContext);
		this.lexerActionIndex = c.lexerActionIndex;
	}

	public LexerATNConfig(@NotNull LexerATNConfig c, @NotNull ATNState state,
						  int actionIndex)
	{
		super(c, state, c.context, c.semanticContext);
		this.lexerActionIndex = actionIndex;
	}

	public LexerATNConfig(@NotNull LexerATNConfig c, @NotNull ATNState state,
						  @Nullable PredictionContext context) {
		super(c, state, context, c.semanticContext);
		this.lexerActionIndex = c.lexerActionIndex;
	}

}
