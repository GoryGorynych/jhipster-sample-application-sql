export interface IGenre {
  id?: number;
  title?: string | null;
  decription?: string | null;
}

export const defaultValue: Readonly<IGenre> = {};
