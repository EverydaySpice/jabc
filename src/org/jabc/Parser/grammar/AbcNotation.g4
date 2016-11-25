grammar AbcNotation;
import StandardRules;

tune: header score NEWLINE;

score:(takt)+;

takt: (note)* TAKTSTRICH;

identifier:     'X:' identifierString=INT NEWLINE;
title:          'T:' titleString=ID NEWLINE;
measure:        'M:' measureString=(ID | NOTE |FRACTION) NEWLINE;
length:         'L:' lengthString=FRACTION NEWLINE;
key:            'K:' keyString=(ID | NOTE) NEWLINE;

header: identifier title optionalHeaderInfo? optionalHeaderInfo? key;

optionalHeaderInfo: measure
                    | length;

note: barNote | singleNote;

singleNote: (' ')+ noteString=NOTE annotation*;

barNote: noteString=NOTE annotation*;

annotation: delimiter #shortenNoteLength
            | MULTIPLIER #multiplier
            | OCTAVE_DOWN #octaveDown
            | OCTAVE_UP #octaveUp;

delimiter: '/' factor=INT;
MULTIPLIER: INT;
OCTAVE_UP: '\'';
OCTAVE_DOWN: ',';

TAKTSTRICH: (' ')* ('|' | '|]');
NOTE: [a-gA-G];




